package code.name.score.octave.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002deB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010:\u001a\u00020;J\u0018\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0010J\u000e\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\fJ\u0014\u0010C\u001a\u00020\u00102\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0\u001fJ\u001a\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u00162\u0006\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\u00020J2\u0006\u0010#\u001a\u00020\bJ\u0006\u0010K\u001a\u00020\bJ\u0010\u0010L\u001a\u00020\u00042\u0006\u0010G\u001a\u00020HH\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\fJ\u0016\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bJ\u001e\u0010P\u001a\u00020;2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010R\u001a\u00020\u0010H\u0007J&\u0010S\u001a\u00020;2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010T\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0010H\u0007J\u0006\u0010U\u001a\u00020;J\u0010\u0010V\u001a\u00020;2\u0006\u0010G\u001a\u00020HH\u0007J\u000e\u0010W\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\fJ\u0014\u0010W\u001a\u00020\u00102\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0\u001fJ\u0006\u0010X\u001a\u00020;J\u0006\u0010Y\u001a\u00020;J\u000e\u0010Z\u001a\u00020;2\u0006\u0010#\u001a\u00020\bJ\u0010\u0010[\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\fH\u0007J\u000e\u0010[\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020;J\u000e\u0010]\u001a\u00020\b2\u0006\u0010^\u001a\u00020\bJ\u000e\u0010_\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\bJ\u0006\u0010`\u001a\u00020\u0010J&\u0010a\u001a\u00020\u00102\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0006\u0010T\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u0010H\u0002J\u0010\u0010b\u001a\u00020;2\b\u0010c\u001a\u0004\u0018\u00010=R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u000f\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\"R$\u0010#\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\b8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\nR\u0011\u0010,\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\nR\u0013\u0010.\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0006R\u0011\u00100\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\nR\u0013\u00102\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0006R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107\u00a8\u0006f"}, d2 = {"Lcode/name/score/octave/helper/MusicPlayerRemote;", "Lorg/koin/core/KoinComponent;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "audioSessionId", "", "getAudioSessionId", "()I", "currentSong", "Lcode/name/score/octave/model/Song;", "getCurrentSong", "()Lcode/name/score/octave/model/Song;", "isPlaying", "", "isPlaying$annotations", "()Z", "isServiceConnected", "mConnectionMap", "Ljava/util/WeakHashMap;", "Landroid/content/Context;", "Lcode/name/score/octave/helper/MusicPlayerRemote$ServiceBinder;", "musicService", "Lcode/name/score/octave/service/MusicService;", "getMusicService", "()Lcode/name/score/octave/service/MusicService;", "setMusicService", "(Lcode/name/score/octave/service/MusicService;)V", "playingQueue", "", "getPlayingQueue$annotations", "getPlayingQueue", "()Ljava/util/List;", "position", "getPosition", "setPosition", "(I)V", "repeatMode", "getRepeatMode", "shuffleMode", "getShuffleMode$annotations", "getShuffleMode", "songDurationMillis", "getSongDurationMillis", "songDurationTime", "getSongDurationTime", "songProgressMillis", "getSongProgressMillis", "songProgressTime", "getSongProgressTime", "songRepository", "Lcode/name/score/octave/repository/SongRepository;", "getSongRepository", "()Lcode/name/score/octave/repository/SongRepository;", "songRepository$delegate", "Lkotlin/Lazy;", "back", "", "bindToService", "Lcode/name/score/octave/helper/MusicPlayerRemote$ServiceToken;", "context", "callback", "Landroid/content/ServiceConnection;", "clearQueue", "cycleRepeatMode", "enqueue", "song", "songs", "getFilePathFromUri", "uri", "Landroid/net/Uri;", "getQueueDurationMillis", "", "getQueueDurationSongs", "getSongIdFromMediaProvider", "moveSong", "from", "to", "openAndShuffleQueue", "queue", "startPlaying", "openQueue", "startPosition", "pauseSong", "playFromUri", "playNext", "playNextSong", "playPreviousSong", "playSongAt", "removeFromQueue", "resumePlaying", "seekTo", "millis", "setShuffleMode", "toggleShuffleMode", "tryToHandleOpenPlayingQueue", "unbindFromService", "token", "ServiceBinder", "ServiceToken", "app_debug"})
public final class MusicPlayerRemote implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final java.util.WeakHashMap<android.content.Context, code.name.score.octave.helper.MusicPlayerRemote.ServiceBinder> mConnectionMap = null;
    @org.jetbrains.annotations.Nullable()
    private static code.name.score.octave.service.MusicService musicService;
    private static final kotlin.Lazy songRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final code.name.score.octave.helper.MusicPlayerRemote INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final code.name.score.octave.service.MusicService getMusicService() {
        return null;
    }
    
    public final void setMusicService(@org.jetbrains.annotations.Nullable()
    code.name.score.octave.service.MusicService p0) {
    }
    
    private final code.name.score.octave.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @java.lang.Deprecated()
    public static void isPlaying$annotations() {
    }
    
    public static final boolean isPlaying() {
        return false;
    }
    
    public final boolean isPlaying(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Song song) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final code.name.score.octave.model.Song getCurrentSong() {
        return null;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int position) {
    }
    
    @java.lang.Deprecated()
    public static void getPlayingQueue$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<code.name.score.octave.model.Song> getPlayingQueue() {
        return null;
    }
    
    public final int getSongProgressMillis() {
        return 0;
    }
    
    public final int getSongDurationMillis() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSongProgressTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSongDurationTime() {
        return null;
    }
    
    public final int getRepeatMode() {
        return 0;
    }
    
    @java.lang.Deprecated()
    public static void getShuffleMode$annotations() {
    }
    
    public static final int getShuffleMode() {
        return 0;
    }
    
    public final int getAudioSessionId() {
        return 0;
    }
    
    public final boolean isServiceConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final code.name.score.octave.helper.MusicPlayerRemote.ServiceToken bindToService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.ServiceConnection callback) {
        return null;
    }
    
    public final void unbindFromService(@org.jetbrains.annotations.Nullable()
    code.name.score.octave.helper.MusicPlayerRemote.ServiceToken token) {
    }
    
    private final java.lang.String getFilePathFromUri(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    public final int getQueueDurationSongs() {
        return 0;
    }
    
    /**
     * Async
     */
    public final void playSongAt(int position) {
    }
    
    public final void pauseSong() {
    }
    
    /**
     * Async
     */
    public final void playNextSong() {
    }
    
    /**
     * Async
     */
    public final void playPreviousSong() {
    }
    
    /**
     * Async
     */
    public final void back() {
    }
    
    public final void resumePlaying() {
    }
    
    /**
     * Async
     */
    public static final void openQueue(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends code.name.score.octave.model.Song> queue, int startPosition, boolean startPlaying) {
    }
    
    /**
     * Async
     */
    public static final void openAndShuffleQueue(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends code.name.score.octave.model.Song> queue, boolean startPlaying) {
    }
    
    private final boolean tryToHandleOpenPlayingQueue(java.util.List<? extends code.name.score.octave.model.Song> queue, int startPosition, boolean startPlaying) {
        return false;
    }
    
    public final long getQueueDurationMillis(int position) {
        return 0L;
    }
    
    public final int seekTo(int millis) {
        return 0;
    }
    
    public final boolean cycleRepeatMode() {
        return false;
    }
    
    public final boolean toggleShuffleMode() {
        return false;
    }
    
    public final boolean setShuffleMode(int shuffleMode) {
        return false;
    }
    
    public final boolean playNext(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Song song) {
        return false;
    }
    
    public final boolean playNext(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends code.name.score.octave.model.Song> songs) {
        return false;
    }
    
    public final boolean enqueue(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Song song) {
        return false;
    }
    
    public final boolean enqueue(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends code.name.score.octave.model.Song> songs) {
        return false;
    }
    
    public static final boolean removeFromQueue(@org.jetbrains.annotations.NotNull()
    code.name.score.octave.model.Song song) {
        return false;
    }
    
    public final boolean removeFromQueue(int position) {
        return false;
    }
    
    public final boolean moveSong(int from, int to) {
        return false;
    }
    
    public final boolean clearQueue() {
        return false;
    }
    
    public static final void playFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final java.lang.String getSongIdFromMediaProvider(android.net.Uri uri) {
        return null;
    }
    
    private MusicPlayerRemote() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcode/name/score/octave/helper/MusicPlayerRemote$ServiceBinder;", "Landroid/content/ServiceConnection;", "mCallback", "(Landroid/content/ServiceConnection;)V", "onServiceConnected", "", "className", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "app_debug"})
    public static final class ServiceBinder implements android.content.ServiceConnection {
        private final android.content.ServiceConnection mCallback = null;
        
        @java.lang.Override()
        public void onServiceConnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName className, @org.jetbrains.annotations.NotNull()
        android.os.IBinder service) {
        }
        
        @java.lang.Override()
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName className) {
        }
        
        public ServiceBinder(@org.jetbrains.annotations.Nullable()
        android.content.ServiceConnection mCallback) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcode/name/score/octave/helper/MusicPlayerRemote$ServiceToken;", "", "mWrappedContext", "Landroid/content/ContextWrapper;", "(Landroid/content/ContextWrapper;)V", "getMWrappedContext$app_debug", "()Landroid/content/ContextWrapper;", "setMWrappedContext$app_debug", "app_debug"})
    public static final class ServiceToken {
        @org.jetbrains.annotations.NotNull()
        private android.content.ContextWrapper mWrappedContext;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.ContextWrapper getMWrappedContext$app_debug() {
            return null;
        }
        
        public final void setMWrappedContext$app_debug(@org.jetbrains.annotations.NotNull()
        android.content.ContextWrapper p0) {
        }
        
        public ServiceToken(@org.jetbrains.annotations.NotNull()
        android.content.ContextWrapper mWrappedContext) {
            super();
        }
    }
}