package Assignment1;

public class ALG3 {
    /*
    ALG3(A, n)
    l = 0
    temp = 0
    for i = 0 to n-1 do
    if A[i] = A[i+1]
        if A[i] = temp
            l = l +1
        else
    temp = A[i]
                if l < 2
    l = 2
            if blah
                l = …
            end if
        end for
    end for
    return l
    */
    public static void main(String[] args) {
        int n = 8;
        int[] A = {3, 2, 2, 2, 4, 5, 5, 3};
        System.out.println(ALG3(A, n));
    }

    static int ALG3(int[] A, int n) {
        int l = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && A[i] == A[i + 1]) {
                if (A[i] == temp) {
                    l = l + 1;
                } else
                    temp = A[i];
                if (l < 2) {
                    l = 2;
                }
            }
        }
        return l + 1 ;
    }
}
