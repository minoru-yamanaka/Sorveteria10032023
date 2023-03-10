# Sorveteria10032023 
https://github.com/minoru-yamanaka/Sorveteria10032023
Atividade em aula 10/03/2023 -> Crie uma aplicação que simule vendas de sorvete em uma sorveteria, de acordo com o apresentado pelo professor.
//recebo os valores
	Double v1  = Double.parseDouble(txtV1.getText ());
	Double v2  = Double.parseDouble(txtV2.getText ());
	Double v3  = Double.parseDouble(txtV3.getText ());
	Double v4  = Double.parseDouble(txtV4.getText ());
	Double p1  = Double.parseDouble(txtP1.getText ());
	Double p2  = Double.parseDouble(txtP2.getText ());
	Double p3  = Double.parseDouble(txtP3.getText ());
	Double p4  = Double.parseDouble(txtP4.getText ());
//soma
	Double soma = ( v1 * p1 )+ ( v2 * p2 )+ ( v3 * p3 )+( v4 * p4 );
//resultado 
	txtTotal.setText(String.valueOf(soma));
