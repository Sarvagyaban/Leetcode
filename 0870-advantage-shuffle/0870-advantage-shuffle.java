class Solution {
       public int[] advantageCount(int[] A, int[] B) {
        
        //store the element of B, and their corresponding index
        List<Item> itemBList = new ArrayList();
        for(int i = 0; i < A.length; i++){
            itemBList.add(new Item(i, B[i]));
        }
        
        //sort Array A increasing order
        Arrays.sort(A); 
        
        //sort Array B increasing order, without loosing their index
        Collections.sort(itemBList, (a, b) -> (a.val - b.val));
        
        //make new array, and fill -1
        int[] result = new int[A.length];
        Arrays.fill(result, -1);
        
        List<Integer> remainingVal = new ArrayList();
        int i = 0;
        int j = 0;
        
        /*
            Gready Appraoch
            sort A, and B (wihout losing its index) increasing oreder of their value
            case 
                if element at A[i], is greater than  itemBList.get(j), 
                - just place A[i] in the right index itemBList.get(j).index
                otherwise 
                -  just store in the remaining  array
        */
        
        
        while(i < A.length && j < A.length){
            if(A[i] > itemBList.get(j).val){
                //place the elemet of A, in the right place
                result[itemBList.get(j).index] = A[i];
                
                //move to next element for both A, and B
                i++;
                j++;
            }else{
                remainingVal.add(A[i]);
                
                //move to the next A item
                i++;
            }
        }
        
        //store the remaining elemet
        j = 0;
        for(i = 0; i < A.length && j < remainingVal.size(); i++){
            if(result[i] == -1){
                result[i] = remainingVal.get(j++);
            }
        }
        
        return result;
    }
    
}

class Item {
    int index;
    int val;
    public Item(int index, int val){
        this.index = index;
        this.val = val;
    }
}