var minSteps = function(s, t) {
    let count = new Array(26).fill(0);
    for(let i=0; i<s.length; i++){
        count[s[i].charCodeAt(0) - 'a'.charCodeAt(0)]++;
        count[t[i].charCodeAt(0) - 'a'.charCodeAt(0)]--;
    }

    let sum = 0
    for(let n of count){
        if(n > 0){
            sum += n;
        }
    }
    return sum;
};
