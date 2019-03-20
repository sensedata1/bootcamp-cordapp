package java_bootcamp;

import net.corda.core.contracts.Command;
import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.contracts.ContractState;
import net.corda.core.transactions.LedgerTransaction;
import org.apache.qpid.proton.amqp.transport.Transfer;
import org.jetbrains.annotations.NotNull;
import sun.jvm.hotspot.asm.Register;

import java.security.PublicKey;
import java.util.List;

public class HouseContract implements Contract {

    public void verify(LedgerTransaction tx) throws IllegalArgumentException {
        if (tx.getCommands().size() !=1)
            throw new IllegalArgumentException("Transaction must have one command");
        Command command = tx.getCommand(0);
        List<PublicKey> requiredSigners = command.getSigners();
        CommandData commandType = command.getValue();

        if (commandType instanceof Register) {

            // Shape constraints
            if (tx.getInputStates().size() != 0)
                throw new IllegalArgumentException("Registration transaction must have no inputs");
            if (tx.getOutputStates().size() != 1)
                throw new IllegalArgumentException("Registration transaction must have one output");





            // Content constraints
            ContractState outputState = tx.getOutput(0);
            if (!(outputState instanceof HouseState))
                throw new IllegalArgumentException("Output must be a HouseState ");
            HouseState houseState = ()


            //Required signer constraints

        } else if (commandType instanceof Transfer) {
            //TODO("Transfer transaction logic.")
        } else {
            throw new IllegalArgumentException("Command type not recognised");
        }
    }


    public class Register implements CommandData {}
    public class Transfer implements CommandData {}
}
