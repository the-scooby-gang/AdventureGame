import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

public abstract class Character {

    private String CharacterType;
    private String CharacterTool;

    public Character(String characterType, String characterTool) {
        CharacterType = characterType;
        CharacterTool = characterTool;
    }

    public String getCharacterType() {
        return CharacterType;
    }

    public void setCharacterType(String characterType) {
        CharacterType = characterType;
    }

    public String getCharacterTool() {
        return CharacterTool;
    }

    public void setCharacterTool(String characterTool) {
        CharacterTool = characterTool;
    }
}
