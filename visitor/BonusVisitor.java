package visitor;

public class BonusVisitor implements IBonusVisitor {

    @Override
    public void visit(Charmander charmander) {
        charmander.annaKehitysBonus();
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        charmeleon.annaKehitysBonus();
    }

    @Override
    public void visit(Charizard charizard) {
        charizard.annaKehitysBonus();
    }
}
