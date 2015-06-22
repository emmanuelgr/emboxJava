package gr.emmanuel.embox.Commands;

import gr.emmanuel.embox.Commands.Core.BaseCommand;
import gr.emmanuel.embox.Commands.Core.IAction;

public class CFunction extends BaseCommand{
public IAction FnIn;
public IAction FnOut;

public CFunction( IAction FnIn, IAction FnOut ){
	super();
	this.FnIn = FnIn;
	this.FnOut = FnOut;
}

@Override
protected void DoIn(){
	if ( FnIn != null ) {
//		FnIn.act(  );
	}
	ExecuteInComplete();
}

@Override
protected void CancelIn(){

}

@Override
protected void DoOut(){
	if ( FnOut != null ) {
//		FnOut.act();
	}
	ExecuteOutComplete();
}

@Override
protected void CancelOut(){

}

@Override
public void update(){

}
}