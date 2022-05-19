package Algoritm.day2;

import java.util.*;

//일곱난쟁이
public class no2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> dwarf = new ArrayList<>();
        int dwarf_sum;

        for (int i = 0; i < 9; i++) {
            dwarf.add(sc.nextInt());
        }

        dwarf_sum = dwarf.stream().mapToInt(Integer::intValue).sum();

        int targetNum = dwarf_sum - 100;
        int fake_dwarf_A = 0;
        int fake_dwarf_B = 0;

        for (int i = 0; i < dwarf.size(); i++) {
            for (int j = i + 1; j < dwarf.size(); j++) {
                if (dwarf.get(i) + dwarf.get(j) == targetNum) {
                    fake_dwarf_A = dwarf.get(i);
                    fake_dwarf_B = dwarf.get(j);
                    break;
                }
            }
        }

        Collections.sort(dwarf);

        for (int i : dwarf) {
            if (i == fake_dwarf_A || i == fake_dwarf_B)
                continue;
            System.out.println(i);
        }
    }
}
