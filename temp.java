package ProjectHw;

public class temp {
    public static void main(String[] args) {
        int[] temp = {80, 89, 23, 18, 60, 19, 54};
        String[] day =
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int high = temp[0];
        int low = temp[0];
        int dayH=0;
        int dayL=0;
                        for(int i=0;i<temp.length;i++){
                            if(temp[i]>high){
                                high=temp[i];
                                dayH=i;
                            }
                           else if(temp[i]<low) {
                                low = temp[i];
                                dayL=i;
                            }


                        }
        System.out.println("Highest temperature of the week: "+high+" "+day[dayH] );
        System.out.println("Lowest temperature of the week: "+low+" " +day[dayL]);

                            }




                        }














