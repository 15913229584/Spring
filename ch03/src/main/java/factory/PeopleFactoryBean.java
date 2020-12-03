package factory;

import edu.nf.ch03.PeoPle;

/**
 * @author 沧海归心心不眠
 * @date 2020/11/30 0030
 */
public class PeopleFactoryBean {
    public PeoPle build()
    {
        return new PeoPle();
    }
}
