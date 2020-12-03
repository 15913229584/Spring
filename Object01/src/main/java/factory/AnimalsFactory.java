package factory;

import edu.nf.obj01.Animals;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class AnimalsFactory {
    public static Animals create()
    {
        return new Animals();
    }
}
