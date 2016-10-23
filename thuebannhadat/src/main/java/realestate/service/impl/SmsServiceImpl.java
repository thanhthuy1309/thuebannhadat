package realestate.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import realestate.constants.ValueConstants;
import realestate.service.SmsService;
import realestate.utils.FileUtils;

/**
 * @author : thuyttt
 * @PG_ID : SmsService
 * @createDate : 23.08.2016
 */
@Service
public class SmsServiceImpl implements SmsService {

  private static final Logger LOGGER = Logger.getLogger(SmsServiceImpl.class);

  /**
   * send code bookticket
   * 
   * @param phone
   * @param code
   * @return true, if successful
   */
  @Override
  public boolean sendSmsCodeRegister(String phone, String code) {
    boolean isSent = false;

    URL obj;
    try {
      obj = new URL(ValueConstants.CONST_SMS_URL);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();

      String customers = "<CUSTOMER>" + "<PHONE>" + phone.replace(" ", "") + "</PHONE>" + "</CUSTOMER>";

      String message = MessageFormat.format(FileUtils.getProperties().getProperty("sms.content"), code);
      String SampleXml = "<RQST>" + "<APIKEY>" + ValueConstants.CONST_SMS_API_KEY + "</APIKEY>" + "<SECRETKEY>"
          + ValueConstants.CONST_SMS_SECRET_KEY + "</SECRETKEY>" + "<ISFLASH>0</ISFLASH>" + "<UNICODE>0</UNICODE>"
          + "<SMSTYPE>7</SMSTYPE>" + "<CONTENT>" + message + "</CONTENT>" + "<CONTACTS>" + customers + "</CONTACTS>"
          + "</RQST>";
      String postData = SampleXml.trim();

      con.setDoOutput(true);
      con.setRequestMethod("POST");

      con.setFixedLengthStreamingMode(postData.getBytes().length);
      con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

      // send the POST out
      PrintWriter out = new PrintWriter(con.getOutputStream());
      out.print(postData);
      out.close();

      int responseCode = con.getResponseCode();
      System.out.println("\nSending 'GET' request to URL : " + ValueConstants.CONST_SMS_URL);
      System.out.println("Response Code : " + responseCode);

      // Đã gọi URL thành công, tuy nhiên bạn phải tự kiểm tra CodeResult xem
      // tin nhắn có gửi thành
      // công không, vì có thể tài khoản bạn không đủ tiền thì sẽ thất bại
      if (responseCode == 200)
        isSent = true;
      {
        // Check CodeResult from response
      }
      // Đọc Response
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      // print result
      System.out.println(response.toString());
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return isSent;
  }

}
