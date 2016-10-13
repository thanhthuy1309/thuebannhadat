package realestate.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import realestate.dto.FileUploadForm;

@Controller
public class PhotoController extends BaseController {

	public static final String PARAM_LATESTPHOTO = "LATEST_PHOTO_PARAM";

	@RequestMapping(value = "/uploadPhoto", method = RequestMethod.GET)
	public String uploadPhotoForm(ModelMap model, HttpServletRequest request) {
		model.addAttribute(PARAM_BASE_URL, getBaseURL(request));
		model.addAttribute("fileUploadForm", new FileUploadForm());
		return "uploadPhoto";
	}

	@RequestMapping(value = "/uploadPhoto", method = RequestMethod.POST)
	public String uploadImageCtlr(ModelMap model, HttpServletRequest request,
			@ModelAttribute("fileUploadForm") FileUploadForm fileUploadForm) {

		List<MultipartFile> files = fileUploadForm.getFiles();
		String rootPath = request.getSession().getServletContext()
				.getRealPath("/");
		File dir = new File(rootPath + File.separator + "img");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (MultipartFile file : files) {
			File serverFile = new File(dir.getAbsolutePath() + File.separator
					+ file.getOriginalFilename());

			// write uploaded image to disk
			try {
				InputStream is = file.getInputStream();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				int i;
				while ((i = is.read()) != -1) {
					stream.write(i);
				}
				stream.flush();
				stream.close();
			} catch (IOException e) {
				System.out.println("error : " + e.getMessage());
			}
		}

		// send baseURL to jsp
		model.addAttribute(PARAM_BASE_URL, getBaseURL(request));
		return "uploadPhoto";
	}
}
