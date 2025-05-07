/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 6, 2025, 9:55:30 AM                     ---
 * ----------------------------------------------------------------
 */
package org.nagacc.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.nagacc.components.SellerCarouselComponent;
import org.nagacc.core.constants.NagAccCoreConstants;
import org.nagacc.core.jalo.ApparelProduct;
import org.nagacc.core.jalo.ApparelSizeVariantProduct;
import org.nagacc.core.jalo.ApparelStyleVariantProduct;
import org.nagacc.core.jalo.ElectronicsColorVariantProduct;
import org.nagacc.core.jalo.Seller;

/**
 * Generated class for type <code>NagAccCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNagAccCoreManager extends Extension
{
	/** Relation ordering override parameter constants for ProductToSeller from ((NagAcccore))*/
	protected static String PRODUCTTOSELLER_SRC_ORDERED = "relation.ProductToSeller.source.ordered";
	protected static String PRODUCTTOSELLER_TGT_ORDERED = "relation.ProductToSeller.target.ordered";
	/** Relation disable markmodifed parameter constants for ProductToSeller from ((NagAcccore))*/
	protected static String PRODUCTTOSELLER_MARKMODIFIED = "relation.ProductToSeller.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Seller createSeller(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.SELLER );
			return (Seller)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Seller : "+e.getMessage(), 0 );
		}
	}
	
	public Seller createSeller(final Map attributeValues)
	{
		return createSeller( getSession().getSessionContext(), attributeValues );
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.SELLERCAROUSELCOMPONENT );
			return (SellerCarouselComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SellerCarouselComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final Map attributeValues)
	{
		return createSellerCarouselComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return NagAccCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellers</code> attribute.
	 * @return the sellers
	 */
	public Collection<Seller> getSellers(final SessionContext ctx, final Product item)
	{
		final List<Seller> items = item.getLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.PRODUCTTOSELLER,
			"Seller",
			null,
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellers</code> attribute.
	 * @return the sellers
	 */
	public Collection<Seller> getSellers(final Product item)
	{
		return getSellers( getSession().getSessionContext(), item );
	}
	
	public long getSellersCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			NagAccCoreConstants.Relations.PRODUCTTOSELLER,
			"Seller",
			null
		);
	}
	
	public long getSellersCount(final Product item)
	{
		return getSellersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellers</code> attribute. 
	 * @param value the sellers
	 */
	public void setSellers(final SessionContext ctx, final Product item, final Collection<Seller> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.PRODUCTTOSELLER,
			null,
			value,
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PRODUCTTOSELLER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellers</code> attribute. 
	 * @param value the sellers
	 */
	public void setSellers(final Product item, final Collection<Seller> value)
	{
		setSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers
	 */
	public void addToSellers(final SessionContext ctx, final Product item, final Seller value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.PRODUCTTOSELLER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PRODUCTTOSELLER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers
	 */
	public void addToSellers(final Product item, final Seller value)
	{
		addToSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers
	 */
	public void removeFromSellers(final SessionContext ctx, final Product item, final Seller value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.PRODUCTTOSELLER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PRODUCTTOSELLER_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PRODUCTTOSELLER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers
	 */
	public void removeFromSellers(final Product item, final Seller value)
	{
		removeFromSellers( getSession().getSessionContext(), item, value );
	}
	
}
