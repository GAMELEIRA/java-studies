package org.gameleira.enums;

public enum PLAYER {
	ARCHER("ARCHER"),
	WARRIOR("WARRIOR"),
	WIZARD("WIZARD");
	
	private String codePlayer;
	
    private PLAYER(String codePlayer) {
        this.codePlayer = codePlayer;
    }
    
    public static PLAYER fromCode(String code) {
        for (PLAYER p : values()) {
            if (p.getCodePlayer().equals(code)) {
                return p;
            }
        }
        return null;
    }
	
    public String getCodePlayer() {
        return codePlayer;
    }
    
}
