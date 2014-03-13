package ro.leasing.actions;

import org.apache.struts.actions.DispatchAction;

import ro.leasing.crosscutting.CtxHolder;

public class BaseAction extends DispatchAction {
	private CtxHolder ctxHolder;
	
	public CtxHolder getCtxHolder() {
		return ctxHolder;
	}

	public void setCtxHolder(CtxHolder ctxHolder) {
		this.ctxHolder = ctxHolder;
	}
}
