class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null ||strs.length==0)
        {
            return "";
        }

        String Prefix=strs[0]; //prefix ghetla flower i.e Prefix=flower

        for(int i=1;i<strs.length;i++)//compare with remainins strings["flow","flight"]
        {
            while(!strs[i].startsWith(Prefix))//jr flow start hot nasel tr flower sobt
            //(flow).startsWith(flower)
            {
                Prefix=Prefix.substring(0,Prefix.length()-1);
                //flower-flowe-flow
                 //(flow).startsWith(flow)right

                 if(Prefix.isEmpty())
                 {
                    return "";
                 }
            }
            
        }
        return Prefix;
    } 
    
}
