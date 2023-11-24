package layoutagenda.clas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Agenda {
    public static void main(String[] args) {

        Connection connection = DriverManager.getConnection();

        JTextField nomeDoPedido;
        JTextField nomeDoCliente;
        JTextField quantidadeVendida;

        JFrame frame = new JFrame("Pedidos"); //Titulo
        frame.setSize(700, 400); //Dimensões altura/largura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerrar o programa quando a janela for fechada
        frame.setResizable(false);//feito para não conseguir alterar o tamanho da tela
        frame.setLocationRelativeTo(null);//tela centralizada no meio

        frame.setLayout(null);//permite configurar o layout do botão


        nomeDoPedido = new JTextField();//caixa de texto
        nomeDoPedido.setBounds(220, 100, 300, 25);//dimensões da caixa
        nomeDoPedido.setFont(new Font("Arial", Font.ITALIC, 12));//fonte da letra
        frame.add(nomeDoPedido);

        nomeDoCliente = new JTextField();
        nomeDoCliente.setBounds(220, 160, 300, 25);
        nomeDoCliente.setFont(new Font("Arial", Font.ITALIC, 12));
        frame.add(nomeDoCliente);

        quantidadeVendida = new JTextField();
        quantidadeVendida.setBounds(220, 220, 300, 25);
        quantidadeVendida.setFont(new Font("Arial", Font.ITALIC, 12));
        frame.add(quantidadeVendida);

        JLabel l = new JLabel("CADASTRO DE PEDIDO");//texto na tela
        l.setBounds(260, 30, 300, 30);//dimensões do tamanho do texto
        l.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));//fonte e tamanho
        frame.add(l);

        JLabel l1 = new JLabel("Nome do pedido: ");
        l1.setBounds(80, 100, 300, 25);
        l1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        frame.add(l1);

        JLabel l2 = new JLabel("Cliente: ");
        l2.setBounds(100, 160, 300, 25);
        l2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        frame.add(l2);

        JLabel l3 = new JLabel("Quantidade vendida: ");
        l3.setBounds(65, 220, 300, 25);
        l3.setFont(new Font("Arial", Font.ROMAN_BASELINE, 15));
        frame.add(l3);

        JButton registerButton = new JButton("Enviar pedido");//mensagem do botão
        registerButton.setBounds(285, 280, 140, 30);//distâncis e dimensões do botão
        registerButton.setFont(new Font("Arial", Font.BOLD, 12));//fonte da mensagem
        registerButton.setForeground(Color.black);//cor da letra
        registerButton.setBackground(Color.white);//cor do fundo
        frame.add(registerButton);

        JButton showButton = new JButton("Exibe pedidos");
        showButton.setBounds(120, 280, 140, 30);
        showButton.setFont(new Font("Arial", Font.BOLD, 12));
        showButton.setForeground(Color.black);
        showButton.setBackground(Color.white);
        frame.add(showButton);
        frame.setVisible(true);

        JButton editButton = new JButton("Editar Pedido");
        editButton.setBounds(450, 280, 140, 30);
        editButton.setFont(new Font("Arial", Font.BOLD, 12));
        editButton.setForeground(Color.black);
        editButton.setBackground(Color.white);
        frame.add(editButton);
        frame.setVisible(true);

        frame.setVisible(true);//tornar a janela visivel


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });



    }

    private static void registerUser() {
    }
}