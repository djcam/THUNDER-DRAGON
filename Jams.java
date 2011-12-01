import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;


public class Jams
{
    private Sequence sequence;
    private Sequencer sequencer;
    
    public Jams() {
        try {
            // From file
            sequence = MidiSystem.getSequence(new File("/Users/Dan/desktop/tunes.mid"));
            // Create a sequencer for the sequence
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
        } 
        catch (IOException e) {
        } 
        catch (MidiUnavailableException e) {
        } 
        catch (InvalidMidiDataException e) {
        }
    }
    
    public void play() {
        sequencer.start();
    }
}
