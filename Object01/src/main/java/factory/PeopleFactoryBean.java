package factory;

import edu.nf.obj01.People;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class PeopleFactoryBean {
    public People build()
    {
        return new People();
    }
}
