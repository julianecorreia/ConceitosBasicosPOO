package br.com.unipar.poo.exemploencapsulamento;

public enum MotorEnum {

    MOTOR_1_0("1.0"),
    MOTOR_1_4("1.4"),
    MOTOR_1_6("1.6"),
    MOTOR_1_8("1.8"),
    MOTOR_2_0("2.0");

    private String descricao;

    MotorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
