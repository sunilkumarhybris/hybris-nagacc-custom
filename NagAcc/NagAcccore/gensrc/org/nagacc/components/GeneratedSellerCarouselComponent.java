/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 6, 2025, 9:55:30 AM                     ---
 * ----------------------------------------------------------------
 */
package org.nagacc.components;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.nagacc.core.constants.NagAccCoreConstants;

/**
 * Generated class for type {@link org.nagacc.components.SellerCarouselComponent SellerCarouselComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSellerCarouselComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>SellerCarouselComponent.timeout</code> attribute **/
	public static final String TIMEOUT = "timeout";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMEOUT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SellerCarouselComponent.timeout</code> attribute.
	 * @return the timeout
	 */
	public Integer getTimeout(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SellerCarouselComponent.timeout</code> attribute.
	 * @return the timeout
	 */
	public Integer getTimeout()
	{
		return getTimeout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @return the timeout
	 */
	public int getTimeoutAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeout( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @return the timeout
	 */
	public int getTimeoutAsPrimitive()
	{
		return getTimeoutAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMEOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final Integer value)
	{
		setTimeout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final SessionContext ctx, final int value)
	{
		setTimeout( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SellerCarouselComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final int value)
	{
		setTimeout( getSession().getSessionContext(), value );
	}
	
}
