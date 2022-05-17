package Algoritm;

import java.util.*;

public class no2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> dwarf = new ArrayList<>();
        List<Integer> new_dwarf = new ArrayList<>();
        int dwarf_sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarf.add(sc.nextInt());
        }

        dwarf_sum = dwarf.stream().mapToInt(Integer::intValue).sum();

        int targetNum = dwarf_sum - 100;
        int fake_sum = 0;

        while (targetNum != fake_sum) {
            Collections.shuffle(Arrays.asList(dwarf));
            fake_sum = dwarf.get(0) + dwarf.get(1);
        }

        for (int i = 0; i < 7; i++) {
            new_dwarf.add(dwarf.get(i + 2));
        }

        Collections.sort(new_dwarf);

        for (int i : new_dwarf) {
            System.out.println(new_dwarf.get(i));
        }
    }
}
