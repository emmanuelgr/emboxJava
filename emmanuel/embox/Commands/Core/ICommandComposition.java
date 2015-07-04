package gr.emmanuel.embox.Commands.Core;

public interface ICommandComposition extends ICommand{
	void Add( ICommand cmnd );
}

