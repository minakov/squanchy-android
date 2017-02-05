package net.squanchy.model.dao;

import android.content.Context;

import net.squanchy.model.AppDatabaseInfo;
import net.squanchy.model.data.Track;
import net.squanchy.model.database.AbstractEntityDAO;

public class TrackDao extends AbstractEntityDAO<Track, Long> {

    public static final String TABLE_NAME = "table_track";

    public TrackDao(Context context) {
        super(context);
    }

    @Override
    protected String getSearchCondition() {
        return "_id=?";
    }

    @Override
    protected String[] getSearchConditionArguments(Long theId) {
        return new String[]{theId.toString()};
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }

    @Override
    public String getDatabaseName() {
        return AppDatabaseInfo.DATABASE_NAME;
    }

    @Override
    protected Track newInstance() {
        return new Track();
    }

    @Override
    protected String[] getKeyColumns() {
        return new String[0];
    }
}