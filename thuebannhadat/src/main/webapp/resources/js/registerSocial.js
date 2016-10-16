function dialog(elmid){
    var elm = document.getElementById(elmid);
    if(!$(elm).hasClass('in')){
        // $('.dialog').css({display:'none'});
        $('.dialog').removeClass('in');
        // elm.style.display='table';
        $(elm).addClass('in')
    }else{
        $(elm).removeClass('in')
        // elm.style.display='none';
    }
}