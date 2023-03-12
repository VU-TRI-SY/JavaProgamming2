package a1_123;

import java.util.Arrays;

public class CoffeeTinGame {
    private static final char GREEN = 'G';
    private static final char BLUE = 'B';
    private static final char REMOVED = '-';
    private static final char NULL = '\u0000';
    private static char[] BeansBag = {BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN, REMOVED, BLUE, GREEN};
    //giả sử BeansBag có đủ số bean cần cho tin game
    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            // take two beans from tin
            char[] twoBeans = takeTwo(tin);
            // process beans to update tin
            char b1 = twoBeans[0];
            char b2 = twoBeans[1];
            // process beans to update tin
            updateTin(tin, b1, b2);
        }
        return anyBean(tin);
    }

    private static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }

            if (count >= 2) // enough beans
                return true;
        }

        // not enough beans
        return false;
    }

    private static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);

        return new char[]{first, second};
    }

    public static char takeOne(char[] tin) {
    	int id = -1;
    	int len = tin.length;
    	
    	do {
    		id = randInt(len);
    	}while(tin[id] == REMOVED); // lấy index cho id một cách random đến khi nào mà bean tại index id đó khác REMOVED
    	
    	char bean = tin[id];
    	tin[id] = REMOVED;
    	
        return bean;
    }

    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) { // vacant position
                tin[i] = bean;
                break;
            }
        }
    }

    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }

        // no beans left
        return NULL;
    }
    
    //--------------------------------------------------------------------
    public static int randInt(int n) {
        return (int) (Math.random() * n);
    }
    
    public static char getBean(char[] beans, char type) {
    	boolean hasSameBean = false;
    	for(char b: beans) {
    		if(b == type) {
    			hasSameBean = true;
    			break;
    		}
    	}
    	
    	int len = beans.length;
    	int id  = -1;
    	char bean = NULL;
    	while(hasSameBean) {
    		id = randInt(len);
    		if(beans[id] == type) {
    			bean = beans[id];
    			beans[id] = REMOVED;
    			break;
    		}
    	}
    	return bean;
    }
    
    public static void updateTin(char[] tin, char bean1, char bean2) {
    	if(bean1 == bean2) {
    		char bean = getBean(BeansBag, BLUE);
    		if(bean != NULL) 
    			putIn(tin, bean);
    		
    	}else {
    		char bean = getBean(BeansBag, GREEN);
    		if(bean != NULL) 
    			putIn(tin, bean);
    	}
    }
}
