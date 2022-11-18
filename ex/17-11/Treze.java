import javax.swing.JOptionPane;

class Treze {
  public static void main(String[] args) {

    double soma = 0;
    double media;
    double[] notas = new double[5];
    int qntMaior = 0;

    for (int i = 0; i < notas.length;) {
      notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe por favor as notas dos alunos:"));
      if (notas[i] >= 0 && notas[i] <= 10) {
        soma += notas[i];
        i++;
      } else {
        JOptionPane.showMessageDialog(null, "Nota inserida inválida");
      }
    }
    media = soma / notas.length;
    for (int i = 0; i < notas.length; i++) {
      if (notas[i] >= media) {
        qntMaior++;
      }
    }
    JOptionPane.showMessageDialog(null, "Média geral: " + media + "\nQuantidade de alunos acima: " + qntMaior);
  }
}