package databases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "dictionary")
public  class Dictionary implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;


    @ColumnInfo(name = "word")
    private String word;

    @ColumnInfo(name = "pronounce_urd")
    private String pronounce_urd;

    @ColumnInfo(name = "meaning")
    private String meaning;

    @ColumnInfo(name = "origin")
    private String origin;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "wazn")
    private String wazn;

    @ColumnInfo(name = "pronounce_eng")
    private String pronounce_eng;

    @ColumnInfo(name = "meaning_eng")
    private String meaning_eng;

    @ColumnInfo(name = "muhavra")
    private String muhavra;

    @ColumnInfo(name = "plural")
    private String plural;

    @ColumnInfo(name = "synonym")
    private String synonym;

    @ColumnInfo(name = "antonym")
    private String antonym;

    @ColumnInfo(name = "composite")
    private String composite;

    @ColumnInfo(name = "rhyming")
    private String rhyming;



    public Dictionary() {
    }

    @Ignore
    public Dictionary(int id, String word, String meaning) {
        this.id = id;
        this.word = word;
        this.meaning = meaning;
    }

    @Ignore
    public Dictionary( String word, String meaning) {

        this.word = word;
        this.meaning = meaning;
    }


    public Dictionary( String word, String pronounce_urd, String meaning, String origin, String type, String wazn, String pronounce_eng, String meaning_eng, String muhavra, String plural, String synonym, String antonym, String composite, String rhyming) {

        this.word = word;
        this.pronounce_urd = pronounce_urd;
        this.meaning = meaning;
        this.origin = origin;
        this.type = type;
        this.wazn = wazn;
        this.pronounce_eng = pronounce_eng;
        this.meaning_eng = meaning_eng;
        this.muhavra = muhavra;
        this.plural = plural;
        this.synonym = synonym;
        this.antonym = antonym;
        this.composite = composite;
        this.rhyming = rhyming;
    }







    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }


    public String getPronounce_urd() {
        return pronounce_urd;
    }

    public void setPronounce_urd(String pronounce_urd) {
        this.pronounce_urd = pronounce_urd;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWazn() {
        return wazn;
    }

    public void setWazn(String wazn) {
        this.wazn = wazn;
    }

    public String getPronounce_eng() {
        return pronounce_eng;
    }

    public void setPronounce_eng(String pronounce_eng) {
        this.pronounce_eng = pronounce_eng;
    }

    public String getMeaning_eng() {
        return meaning_eng;
    }

    public void setMeaning_eng(String meaning_eng) {
        this.meaning_eng = meaning_eng;
    }

    public String getMuhavra() {
        return muhavra;
    }

    public void setMuhavra(String muhavra) {
        this.muhavra = muhavra;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getAntonym() {
        return antonym;
    }

    public void setAntonym(String antonym) {
        this.antonym = antonym;
    }

    public String getComposite() {
        return composite;
    }

    public void setComposite(String composite) {
        this.composite = composite;
    }

    public String getRhyming() {
        return rhyming;
    }

    public void setRhyming(String rhyming) {
        this.rhyming = rhyming;
    }






}
