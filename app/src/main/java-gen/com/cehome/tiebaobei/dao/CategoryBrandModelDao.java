package com.cehome.tiebaobei.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cehome.tiebaobei.dao.CategoryBrandModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATEGORY_BRAND_MODEL".
*/
public class CategoryBrandModelDao extends AbstractDao<CategoryBrandModel, Void> {

    public static final String TABLENAME = "CATEGORY_BRAND_MODEL";

    /**
     * Properties of entity CategoryBrandModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property BrandId = new Property(0, Integer.class, "brandId", false, "BRAND_ID");
        public final static Property CategoryId = new Property(1, Integer.class, "categoryId", false, "CATEGORY_ID");
        public final static Property ModelId = new Property(2, Integer.class, "modelId", false, "MODEL_ID");
    };


    public CategoryBrandModelDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryBrandModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATEGORY_BRAND_MODEL\" (" + //
                "\"BRAND_ID\" INTEGER," + // 0: brandId
                "\"CATEGORY_ID\" INTEGER," + // 1: categoryId
                "\"MODEL_ID\" INTEGER);"); // 2: modelId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATEGORY_BRAND_MODEL\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CategoryBrandModel entity) {
        stmt.clearBindings();
 
        Integer brandId = entity.getBrandId();
        if (brandId != null) {
            stmt.bindLong(1, brandId);
        }
 
        Integer categoryId = entity.getCategoryId();
        if (categoryId != null) {
            stmt.bindLong(2, categoryId);
        }
 
        Integer modelId = entity.getModelId();
        if (modelId != null) {
            stmt.bindLong(3, modelId);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public CategoryBrandModel readEntity(Cursor cursor, int offset) {
        CategoryBrandModel entity = new CategoryBrandModel( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // brandId
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // categoryId
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2) // modelId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CategoryBrandModel entity, int offset) {
        entity.setBrandId(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setCategoryId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setModelId(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(CategoryBrandModel entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(CategoryBrandModel entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}