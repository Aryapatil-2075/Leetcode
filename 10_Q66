class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0 ; i--)//carry magun shuru hote
        {
            if(digits[i] < 9 )//dgt jr 9 peksha lahan asel tr
            {
                digits[i]++; //magun carry add karto
                return digits;
            }
            digits[i]=0;//jr 9 asel tr 0 karych


        }
        int[] result=new int[digits.length+1];//jr sagle 9 asel tr navin array create karto jr 999->1000 
        result[0]=1;//pahile value 1[1000]
        return result;
        
    }
}
