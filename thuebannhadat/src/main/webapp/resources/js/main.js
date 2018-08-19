var owl_service,owlProjectSlider;
$(document).ready(function(){
    $("img.lazy").each(function(){
        $(this).attr('src',$(this).data('original'));
        $(this.parentNode).nailthumb();
    });
    $('.navbar-toggle').click(function(){
        $('body').toggleClass('nav-open')
    });
    $('.sorts>span').click(function(){
        var view = $(this).data('view');
        if(view == 'list') $('.a-b-s').addClass('abs-list');
        else $('.a-b-s').removeClass('abs-list');
    })
    if($('#owl-slider').length==1){
        $("#owl-slider").owlCarousel({
            autoPlay: true,
            animateOut: 'fadeOut',  
            items : 1,
            // lazyLoad: true,
            nav : true,
            navText : ["", ""]
        });
    }
    if($('#hot-owl-slider').length==1){
        hotowl = $("#hot-owl-slider").owlCarousel({
            autoPlay: false,
            animateOut: 'fadeOut',  
            mouseDrag: false, 
            touchDrag: false,
            items : 1,
            // lazyLoad: true,
            nav : false,
            navText : ["", ""]
        });
    }
    if($('#owl-banner').length==1){
        $("#owl-banner").owlCarousel({
            autoPlay: false,
            animateOut: 'fadeOut',  
            items : 1,
            // lazyLoad: true,
            nav : true,
            navText : ["", ""]
        });
    }
    if($('#owl-hot-item').length==1){
        $("#owl-hot-item").owlCarousel({
            autoPlay: false,
            animateOut: 'fadeOut',  
            items : 4,
            mouseDrag: false, 
            touchDrag: false,
            margin: 10,
            // lazyLoad: true,
            nav : true,
            navText : ["", ""],
            responsive: {
                1400: {items : 4},
                980: {items : 3},
                768: {items : 2},
                0: {items : 1},

            }
        });
    }
    if($('#owl-news').length==1){
        hotnewsowl = $("#owl-news").owlCarousel({
            autoPlay: true,
            // animateOut: 'fadeOut',  
            margin: 20,
            items : 4,
            // lazyLoad: true,
            nav : true,
            navText : ["", ""],
            responsive: {
                1400: {items : 4},
                980: {items : 3},
                768: {items : 2},
                0: {items : 1},

            }
        });
    }
    if($('#owl-service').length==1){
        owl_service = $("#owl-service").owlCarousel({
            autoPlay: true,
            // animateOut: 'fadeOut',  
            margin: 20,
            items : 4,
            // lazyLoad: true,
            nav : true,
            navText : ["", ""],
            responsive: {
                1400: {items : 3},
                1200: {items : 3},
                980: {items : 3},
                768: {items : 2},
                0: {items : 1},

            }
        });
    }
    if($('#owl-project-slider').length==1){
        owlProjectSlider = $("#owl-project-slider").owlCarousel({
            autoPlay: true,
            // animateOut: 'fadeOut',  
            margin: 0,
            items : 1,
            // lazyLoad: true,
            nav : false,
            navText : ["", ""],
            startPosition: 'URLHash',
            // responsive: {
            //     1200: {items : 4},
            //     768: {items : 3},
            //     0: {items : 2},

            // }
        }).on('changed.owl.carousel',function(e){
            console.log(e)
            $('.thumb-navs .thumb-nav.active').removeClass('active')
            $('.thumb-navs .thumb-nav:eq('+e.item.index+')').addClass('active')
        })
    }
    $('.tabs ul>li').click(function(){
        $(this).parent().find('.active').removeClass('active');
        $(this).addClass('active');
    })
    // $('.dropdown>.btn').click(function(){
    //     $(this).parent().toggleClass('open');
    //     event.stopPropagation() 
    // });
    // $(document).click(function(){
    //     $('.dropdown.open').removeClass('open')
    // })
    $('.selectpicker').selectpicker();
    $('.view-type > .fa').click(function(){
        $('.view-type .active').removeClass('active');
        $(this).addClass('active');
        var view = $(this).data('view');
        if(view == 'grid') $('.items').addClass('grid');
        else $('.items').removeClass('grid');
    });
    $('[data-toggle="collapse"]').click(function(){
        $($(this).data('target')).toggle();
    });
    $('.btn>.btn').click(function(){

    });
    $('#loginFrm').validationEngine({isPopup:true,scroll:false})
    $('.packets .packet-item').hover(function(){
        $('.packets .packet-item.active').removeClass('active');
        $(this).addClass('active');
    })
    $('.detail-box .acts>div').click(function(){
        $('.detail-box .active').removeClass('active');
        $(this).addClass('active');
        $('#'+$(this).data('elm')).addClass('active');
    })
    $('.wh-tabs>ul>li').click(function(){
        var i = $(this).index();
        $('.wh-tabs>ul>li.active').removeClass('active');
        $(this).addClass('active');
        $('.wh-tabs>.tabs-content>.active').removeClass('active');
        $('.wh-tabs>.tabs-content>div:eq('+i+')').addClass('active');
        
    })
    $('.edit-acc').click(function(){
        $(this).parent().toggleClass('active')
    })
    $('#myFrm').validationEngine()
    var image = document.getElementById('image');
      var cropBoxData;
      var canvasData;
      var cropper;
    $('#modal').on('shown.bs.modal', function () {
        cropper = new Cropper(image, {
            autoCropArea: 0.5,
            ready: function () {

            // Strict mode: set crop box data first
            cropper.setCropBoxData(cropBoxData).setCanvasData(canvasData);
            }
        });
    }).on('hidden.bs.modal', function () {
        cropBoxData = cropper.getCropBoxData();
        canvasData = cropper.getCanvasData();
        cropper.destroy();
    });
    setTimeout(function(){
        if($('#nicescroll').length>0)
        $('#nicescroll').niceScroll('#nicescroll>div', {
            cursoropacitymax: 0.9,
            cursoropacitymin: 0.7,
            touchbehavior: false,
            cursorborder: '0',
            scrollspeed: 100,
            bouncescroll: false,
            horizrailenabled: true,
            //autohidemode: false,
            cursorcolor: '#27ae61',
            cursorwidth: 4,
            cursorborderradius: 0
        });
        if($('#nicescroll2').length>0)
        $('#nicescroll2').niceScroll('#nicescroll2>div', {
            cursoropacitymax: 0.9,
            cursoropacitymin: 0.7,
            touchbehavior: false,
            cursorborder: '0',
            scrollspeed: 100,
            bouncescroll: false,
            horizrailenabled: true,
            //autohidemode: false,
            cursorcolor: '#27ae61',
            cursorwidth: 4,
            cursorborderradius: 0
        });
    },500)
    if($('.datepicker').length>0)
        $('.datepicker').datetimepicker({
            pickTime: false,
        });
    if($('.swipebox').length>0)
    $('a.swipebox').swipebox({
        useCSS: true,
        callback:function(elm){
             console.log(elm)
        }
    });

});
function addNotice(message, type, stick){
    var tit = '';
    if(type==undefined)
        type = 'info';
    if(type=='info'){
        tit = 'Info Notifications'
    }
    if(type=='success'){
        tit = 'Success Notifications'
    }
    if(type=='warning'){
        tit = 'Warning Notifications'
    }
    if(type=='error'){
        tit = 'Error Notifications'
    }
    toastr[type](message, tit)
}
function dialog(elmid){
    var elm = document.getElementById(elmid);
    if(!$(elm).hasClass('in')){
        // $('.dialog').css({display:'none'});
        $('.dialog').removeClass('in');
        $('body,html').addClass('pop-open');
        $(elm).addClass('in')
    }else{
        $(elm).removeClass('in')
        $('body,html').removeClass('pop-open');
        // elm.style.display='none';
    }
}
function addRedactorEditor(Element,width) {
    Element.redactor({
        minHeight: width||240,
        //air: true,
        //wym: true,
        'formatting':['p', 'blockquote', 'pre', 'h1', 'h2', 'h3', 'h4', 'h5'],
        // 'buttons': ['html', 'formatting', '|', 'bold', 'italic', 'deleted', '|', 'unorderedlist', 'orderedlist', 'outdent', 'indent', 'alignment', '|', 'video', 'link', '|', 'fontcolor', 'backcolor']
        //plugins: ['advanced']
    });
}
function addEditorFeature(ElementID, height) {
//    var instance = CKEDITOR.instances[ElementID];
//    if (instance) {
//        return;
//    }
    if(typeof height == 'undefined') height = 320
    try {
        CKEDITOR.config.startupFocus = false;
        CKEDITOR.replace(ElementID, {
            'height': height,
            'toolbar': [
                ['Source'], ['Preview', 'Templates'],
                ['Image', 'Youtube','Video'], ['Flash', 'Table'],
                ['HorizontalRule', 'Smiley', 'SpecialChar'], ['PageBreak', 'Iframe'],
                ['Bold', 'Italic'], ['Underline', 'Strike'],
                ['Subscript', 'Superscript'],
                ['NumberedList', 'BulletedList'], ['Outdent', 'Indent'],
                ['Blockquote', 'CreateDiv'],
                ['JustifyLeft', 'JustifyCenter'], ['JustifyRight', 'JustifyBlock'],
                ['BidiLtr', 'BidiRtl', 'Language'],
                ['Link', 'Unlink'],
                /*['Styles'], */
                ['Format'], ['Font'], ['FontSize'],
                ['TextColor', 'BGColor'],['RemoveFormat'],
                ['Maximize', 'ShowBlocks']
                
            ],
            'removePlugins': 'magicline'

        });
    } catch (e) {
        addNotice(e.message,'error');
    }

}
function addEditorBasic(ElementID, height) {
//    var instance = CKEDITOR.instances[ElementID];
//    if (instance) {
//        return;
//    }
    height = height||320
        CKEDITOR.config.startupFocus = false;
        CKEDITOR.replace(ElementID, {
            'height': height,
            'toolbar': [
                ['ShowBlocks', 'Image'],
                ['NumberedList', 'BulletedList'],['Outdent', 'Indent'],['Link', 'Unlink'],
                ['JustifyLeft', 'JustifyCenter'], ['JustifyRight', 'JustifyBlock'],
                ['Format'], ['TextColor', 'BGColor']
            ],
            'removePlugins': 'magicline'
        });
}
function GotoStep(i){
    $('[data-step].open').removeClass('open')
    $('[data-step="'+i+'"]').addClass('open')
}
function verifyCode(){
    $('#login-menu').hide();
    $('#account-menu').css('display','inline-block');
    dialog('noti-dialog');
}
function login(){
    $('#login-menu').hide();
    $('#account-menu').css('display','inline-block');
}
function logout(){
    $('#login-menu').css('display','inline-block');
    $('#account-menu').hide();
}
function addNotice(message, type, stick){
    var tit = '';
    if(type==undefined)
        type = 'info';
    if(type=='info'){
        tit = 'Info Notifications'
    }
    if(type=='success'){
        tit = 'Success Notifications'
    }
    if(type=='warning'){
        tit = 'Warning Notifications'
    }
    if(type=='error'){
        tit = 'Error Notifications'
    }
    toastr[type](message, tit)
}