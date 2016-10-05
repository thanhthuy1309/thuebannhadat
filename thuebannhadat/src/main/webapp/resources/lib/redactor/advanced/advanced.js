if (typeof RedactorPlugins === 'undefined') var RedactorPlugins = {};

RedactorPlugins.advanced = {

	init: function()
	{
                var Redactor=this;
		this.addBtnBefore('video', 'plugin_img', 'Insert Image', function(obj)
		{
                    
                    Redactor.saveSelection();
                    if($("#redactor_advanced_img").length==0){
                        
                        $('body').append(
                            '<div id="redactor_advanced_img">\
                                <div class="grid_9">\
                                    <div class="pr20">\
                                        <table class="w100pc">\
                                            <tr>\
                                                <td>Image Url</td>\
                                                <td class="pr"><form name="frmredactor_advanced_img">\
                                                    <div class="pr">\
                                                        <input type="text" id="redactor_advanced_img_src" class="classic-input w100pc mb8" />\
                                                        <div class="pa hover50 icon16 chooseimage chooseimage_icon"\
                                                        onclick="redactorBrowse()"\
                                                        title="Choose image from my host"\
                                                        ></div>\
                                                    </div>\
                                                    </form>\
                                                </td>\
                                            </tr>\
                                            <tr>\
                                                <td>Width</td>\
                                                <td><input type="number" id="redactor_advanced_img_w" class="classic-input w100pc mb8" /></td>\
                                            </tr>\
                                            <tr>\
                                                <td>Height</td>\
                                                <td><input type="number" id="redactor_advanced_img_h" class="classic-input w100pc mb8" /></td>\
                                            </tr>\
                                            <tr>\
                                                <td>&nbsp;</td>\
                                                <td><input type="checkbox" checked=1 id="redactor_advanced_img_c"/><label for="">Classic Image</label></td>\
                                            </tr>\
                                        </table>\
                                    </div>\
                                </div>\
                            </div>');
                    }
                    $("#redactor_advanced_img_src").val("");
                    $("#redactor_advanced_img_w").val("");
                    $("#redactor_advanced_img_w").val("");
                    ShowConfirmDialogMessage($("#redactor_advanced_img"), "Insert Image ",function(){
                        try{
                            var src=$("#redactor_advanced_img_src").val(),str="";
                            var w=parseInt($("#redactor_advanced_img_w").val());
                            var h=parseInt($("#redactor_advanced_img_h").val());
                            if (w>0){
                                if(w>500) w=500;
                                str+= ' width:'+w+'px;';
                            }
                            if (h>0){
                                if(h>500) h=500;
                                str+= ' height:'+h+'px;';
                            }
                            if ($('#redactor_advanced_img_c').is(':checked')) {
                                str+= ' margin:0 auto;display:block;border:1px solid #ccc;padding:4px;background:#fff';
                            } 
                            Redactor.restoreSelection();
                            if(src!=""){
                                obj.insertHtml('<img src="'+src+'" style="max-with:500px;'+str+'"/>');
                                CloseConfirmDialogMessage($("#redactor_advanced_img"));
                            }
                            
                        }catch(e){}
                    });
                    $("#redactor_advanced_img_src").focus();
                    
		});
		//this.addBtnSeparatorBefore('advanced');
	},
	insertClip: function(html)
	{
		this.restoreSelection();
		this.execCommand('inserthtml', html);
		this.modalClose();
	}
}
function redactorBrowse(){
        BrowseServer('redactor_advanced_img_src' ); 
}