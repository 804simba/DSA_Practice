package com.timtez.attendToLater;

import java.util.ArrayList;

public class StampingTheSequence {
    // https://leetcode.com/problems/stamping-the-sequence/solutions/
    // https://leetcode.com/problems/stamping-the-sequence/solutions/2459609/java-fully-explained-with-line-by-line-in-simplest-possible-way/
    public int[] movesToStamp(String stamp, String target) {

        char[] s = stamp.toCharArray();
        char[] t = target.toCharArray();
        boolean[] visited = new boolean[t.length];


        ArrayList<Integer> answer = new ArrayList<>();
        int count=0;

        while(count<t.length){

            //do as many iterations of the whole target till it becomes ?????---
            //because a window that's not recognized as a stamp in this iteration
            //might be considered as one in the next iteration.

            boolean replaced = false;
            //if after a whole iteration, nothing was replaced, that means that there was nothing to be replaced,
            //hence there were no stamps.

            for(int i=0;i<=t.length-s.length;i++){

                //window can't have a start index after target length-stamp length

                if(!visited[i] && canRemoveStamp(s,t,i)){

                    //count the letters that we changed this time
                    count+=numberOfLettersRemoved(t,i,s.length);


                    replaced=true;
                    //we don't need to check a window starting from this length again
                    //Think logically impact of a stamp over stamp over stamp on the same window
                    // is the same if we consider a pattern as a whole
                    // even if stamps are arranged like a zig-zag sand witch,
                    //the repeating stamp will only affect characters in the same window
                    visited[i]=true;
                    answer.add(i);
                    if(count==t.length){
                        //if all characters are replaced, our work is done.
                        break;
                    }


                }


            }

            if(!replaced)
                return new int[0];

        }

        int result[] = new int[answer.size()];

        //just reversing the list as the order in which the target is converted into a blank slate is reverse of the order
        // in which blank slate was converted into the target.
        for(int i=0;i<result.length;i++){

            result[i] = answer.get(answer.size()-i-1);

        }

        return result;


    }


    private boolean canRemoveStamp(char[] s, char []t , int startOfStamp){

        for(int i=0;i<s.length;i++){
            //if there is a character that isn't ? and is not the respective element in the stamp
            //in other words if this window isn't the top most stamp, return false
            //ex: leet -> leet is valid, leel->leet is invalid
            if(t[startOfStamp+i]!='?' && s[i]!=t[startOfStamp+i])
                return false;

        }

        return true;

    }


    public int numberOfLettersRemoved(char []t, int start, int length){

        int count=0;

        for(int i=0;i<length;i++){


            if(t[i+start]!='?'){
                //just replace the character that is needed to be replaced and return the count of replacements.
                t[i+start]='?';
                count++;

            }


        }

        return count;

    }
}
