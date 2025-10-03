public class ContainerWithMostWater {
    public static int MostWater(int[] height){
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
       
        return maxArea;
    } 
    public static void main(String[] args) {
        int[] height = {4,1,3,7,8,20};
        System.out.println(MostWater(height));
    }
}
