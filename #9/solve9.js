function amendTheSentence(s) {
    return s.replace(/[A-Z]/g, (str, offset) => {
        if (!offset) return str
        return ` ${str}`
    }).toLowerCase()
}
/*
Input:"CodesignalIsAwesome"
Actual output:
Expected output:"codesignal is awesome"
Execute time limit :16000 ms
Execute time :
Message:
*/