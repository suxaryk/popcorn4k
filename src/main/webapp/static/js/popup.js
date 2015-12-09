$(function () {
    $('.link').click(function (e) {

        if (!$('.popup1:visible').length) {
            $('.popup1').fadeIn();
        }
        e.preventDefault();
        return false;
    });


    $(document.getElementsByName('submitSchedule')).click(
            (function (e) {
                $(document.getElementById('dropboxSchedule')).fadeOut();
                if (!$('.popup2:visible').length) {
                    $('.popup1').resize('.seatChoose');
                    $('.popup2').slideToggle();
                    function showValues() {
                        var cin = document.getElementsByName('Cinema');
                        var form = document.getElementsByName('Format');
                        var date = document.getElementsByName('Date');
                        var hour = document.getElementsByName('Hour');

                        var cinem = cin.options[cin.selectedIndex].text;
                        var format = form.options[form.selectedIndex].text;
                        var dateOfMovie = date.options[date.selectedIndex].text;
                        var hourOfMovie = hour.options[hour.selectedIndex].text;

                        alert(cinem, format, dateOfMovie, hourOfMovie);
                    }
                   showValues();
                }
                e.preventDefault();
                return false;

            }
            )

            );

    $(document.getElementsByName('back')).click(
            function () {
                $(this).parents('.popup2').fadeOut();

                $(document.getElementById('dropboxSchedule')).fadeIn();

            });



    $('.popup1 .close, .popup1 .bg').click(function () {
        $(this).parents('.popup1').fadeOut();
    });
});

/*$(function() {
 $(document.getElementsByName('submitSchedule')).click(function(e) {
 
 if (!$('.popup2:visible').length) {
 $('.popup2').fadeIn();
 }
 e.preventDefault();
 return false;
 });
 
 
 $('.popup2 .close, .popup2 .bg').click(function() {
 $(this).parents('.popup2').fadeOut();
 });
 });*/
