function questionCorrection(s){
    s = s.toLowerCase();
    s = s.replace(/[^A-Za-z0-9,]/g, ' ');
    s = s.replace(/^[^A-Za-z0-9]+/, '');
    s = s.replace(/[^A-Za-z0-9]+$/, '');
    s = s.replace(/(?<=[A-Za-z0-9])([^A-Za-z0-9]+)(?=[A-Za-z0-9])/g, m => {
        if (/^[\s]+$/.test(m)) return ' ';
        return ', ';
    });
    s = s[0].toUpperCase() + s.slice(1) + '?';
    return s;
}
/*Input:" this  is not   a     relevant question , is it??? "
Actual output:"This is not a relevant question, is it?"
Expected output:"This is not a relevant question, is it?"
Execute time limit :16000 ms
Execute time :2 ms
Message:
Right answer*/