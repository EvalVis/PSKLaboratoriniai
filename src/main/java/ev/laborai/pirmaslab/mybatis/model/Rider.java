package ev.laborai.pirmaslab.mybatis.model;

public class Rider {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RIDER.ID
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RIDER.NAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RIDER.SURNAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    private String surname;

    private String nickname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RIDER.ID
     *
     * @return the value of PUBLIC.RIDER.ID
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RIDER.ID
     *
     * @param id the value for PUBLIC.RIDER.ID
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RIDER.NAME
     *
     * @return the value of PUBLIC.RIDER.NAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RIDER.NAME
     *
     * @param name the value for PUBLIC.RIDER.NAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RIDER.SURNAME
     *
     * @return the value of PUBLIC.RIDER.SURNAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RIDER.SURNAME
     *
     * @param surname the value for PUBLIC.RIDER.SURNAME
     *
     * @mbg.generated Mon Mar 14 12:55:58 EET 2022
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}