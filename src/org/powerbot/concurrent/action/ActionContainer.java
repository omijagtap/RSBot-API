package org.powerbot.concurrent.action;

/**
 * A action container that is able to perform basic operations to a thread dispatching actions.
 *
 * @author Timer
 */
public interface ActionContainer {
	/**
	 * Begins listening to the actions associated with this <code>ActionContainer</code>.
	 */
	public void listen();

	/**
	 * Locks this container from processing and dispatching of actions.
	 */
	public void lock();

	/**
	 * Destroys this <code>ActionContainer</code> and cleans up.
	 */
	public void destroy();

	/**
	 * Begins listening on an action for appropriate dispatching.
	 *
	 * @param action The <code>Action</code> to handle.
	 */
	public void append(Action action);

	/**
	 * Terminates listening and dispatch of the specified <code>Action</code>.
	 *
	 * @param action The <code>Action</code> to lose handle of.
	 */
	public void omit(Action action);
}
