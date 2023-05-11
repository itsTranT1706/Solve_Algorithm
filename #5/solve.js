function truncateString(s) {
    if (s === "") return s;
    if (s[0] % 3 === 0) return truncateString(s.slice(1));
    if (s.slice(-1) % 3 === 0) return truncateString(s.slice(0, -1));
    if ((s[0] + s.slice(-1)) % 3 === 0) return truncateString(s.slice(1, -1));
    return s;
}
/*
Input:"312248"
Actual output:
Expected output:"2"
Execute time limit :16000 ms
Execute time :
Message:

*/