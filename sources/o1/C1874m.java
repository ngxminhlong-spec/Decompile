package o1;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874m implements MediaPlayer.OnPreparedListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ DialogC1878o f14283o;

    public C1874m(DialogC1878o dialogC1878o) {
        this.f14283o = dialogC1878o;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        DialogC1878o dialogC1878o = this.f14283o;
        dialogC1878o.f14291q.postDelayed(dialogC1878o.f14293s, 32L);
    }
}
