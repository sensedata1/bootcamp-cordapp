package java_bootcamp;

import com.google.common.collect.ImmutableList;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
<<<<<<< HEAD
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
=======

>>>>>>> e6a7ea584a2e7d0a5cc32eb641d6942b7d38bd36
import java.util.List;

/* Our state, defining a shared fact on the ledger.
 * See src/main/java/examples/ArtState.java for an example. */
<<<<<<< HEAD
public class TokenState implements ContractState {


    // The attributes that will be stored on the ledger as part of the state.

    private Party issuer;
    private Party owner;
    private int amount;

    public TokenState(Party issuer, Party owner, int amount) {
        this.issuer = issuer;
        this.owner = owner;
        this.amount = amount;

    }


    public Party getIssuer() {
        return issuer;
    }

    public Party getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }


// Overrides `participants`, the only field defined by `ContractState`.
    // Defines which parties will store the state.

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {
        List<AbstractParty> participants = new ArrayList<>();
        participants.add(issuer);
        participants.add(owner);
        return participants;
    }

    public static void main(String[] args) {
        Party alice = null;
        Party bob = null;
        int amount = 1;


        TokenState token = new TokenState(alice, bob, 1);
    }


=======
public class TokenState {
>>>>>>> e6a7ea584a2e7d0a5cc32eb641d6942b7d38bd36

}