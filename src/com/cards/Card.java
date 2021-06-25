package com.cards;

public class Card {

    private String phrase;
    private String meaning;
    private String synonyms;

    private final String PHRASE_TEXT = "Phrase: ";
    private final String MEANING_TEXT = "Meaning: ";
    private final String SYNONYMS_TEXT = "Synonyms: ";


    public Card(String phrase, String meaning, String synonyms) {
        this.phrase = phrase;
        this.meaning = meaning;
        this.synonyms = synonyms;
    }

    public void printCard() {
        System.out.println(PHRASE_TEXT + phrase);
        System.out.println(MEANING_TEXT + meaning);
        System.out.println(SYNONYMS_TEXT + synonyms);
    }

    public void changeCardData(String phrase, String meaning, String synonyms) {
        this.phrase = phrase;
        this.meaning = meaning;
        this.synonyms = synonyms;
    }

    public String getPhrase() {
        return phrase;
    }
}
