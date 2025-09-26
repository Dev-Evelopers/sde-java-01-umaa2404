public class MinFoldsEasy {
    public static int minFolds(int h, int w, int h1, int w1) {
        int folds = 0;

    
        while (h > h1) {
            h = (h + 1) / 2; 
            folds++;
        }

        
        while (w > w1) {
            w = (w + 1) / 2; 
            folds++;
        }

        return folds;
    }

    public static void main(String[] args) {
        System.out.println(minFolds(2, 3, 2, 2));
        System.out.println(minFolds(8, 4, 6, 1)); 
    }
}
    

