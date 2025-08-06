package bab6;

import javax.swing.JOptionPane;

public class Bab6 {

    public static void main(String[] args) {

        // Program Menentukan Ganjil atau Genap
        String temp = JOptionPane.showInputDialog(null,
                "Masukan Angka", "Menentukan Ganjil Genap",
                JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(temp);

        if ((input % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Angka : "
                    + input + " adalah bilangan GENAP", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Angka : "
                    + input + " adalah bilangan GANJIL", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // Program Menentukan Kategori Umur
        String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ?");
        int umurInt = Integer.parseInt(umur);

        if (umurInt <= 5) {
            JOptionPane.showMessageDialog(null, "Balita");
        } else if (umurInt >= 6 && umurInt <= 11) {
            JOptionPane.showMessageDialog(null, "Anak - anak");
        } else if (umurInt >= 12 && umurInt <= 25) {
            JOptionPane.showMessageDialog(null, "Remaja");
        } else {
            JOptionPane.showMessageDialog(null, "Dewasa");
        }

        // Program Menentukan Nilai (A/B/C/D)
        String nilai = JOptionPane.showInputDialog(null, "Masukan nilai (A/B/C/D):");
        switch (nilai.toUpperCase()) {
            case "A":
                JOptionPane.showMessageDialog(null, "Sangat Baik.");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Baik.");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Cukup.");
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Jelek.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Salah memasukan nilai!");
                break;
        }
    }
}
