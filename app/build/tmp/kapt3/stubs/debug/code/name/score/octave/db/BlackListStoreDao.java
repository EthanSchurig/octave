package code.name.score.octave.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\'J\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcode/name/score/octave/db/BlackListStoreDao;", "", "blackListPaths", "", "Lcode/name/score/octave/db/BlackListStoreEntity;", "clearBlacklist", "", "deleteBlacklistPath", "blackListStoreEntity", "(Lcode/name/score/octave/db/BlackListStoreEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBlacklistPath", "blackListStoreEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BlackListStoreDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.db.BlackListStoreEntity blackListStoreEntity);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    java.util.List<code.name.score.octave.db.BlackListStoreEntity> blackListStoreEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteBlacklistPath(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.db.BlackListStoreEntity blackListStoreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Query(value = "DELETE FROM BlackListStoreEntity")
    public abstract void clearBlacklist();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM BlackListStoreEntity")
    public abstract java.util.List<code.name.score.octave.db.BlackListStoreEntity> blackListPaths();
}