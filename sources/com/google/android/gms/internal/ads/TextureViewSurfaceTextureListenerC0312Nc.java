package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import b0.RunnableC0203p;
import java.io.IOException;
import java.util.HashMap;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0312Nc extends AbstractC0322Pc implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: G, reason: collision with root package name */
    public static final HashMap f6320G;

    /* renamed from: A, reason: collision with root package name */
    public C0362Xc f6321A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f6322B;

    /* renamed from: C, reason: collision with root package name */
    public int f6323C;

    /* renamed from: D, reason: collision with root package name */
    public C0337Sc f6324D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6325E;

    /* renamed from: F, reason: collision with root package name */
    public Integer f6326F;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0308Md f6327q;

    /* renamed from: r, reason: collision with root package name */
    public final C0372Zc f6328r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6329s;

    /* renamed from: t, reason: collision with root package name */
    public int f6330t;

    /* renamed from: u, reason: collision with root package name */
    public int f6331u;

    /* renamed from: v, reason: collision with root package name */
    public MediaPlayer f6332v;

    /* renamed from: w, reason: collision with root package name */
    public Uri f6333w;

    /* renamed from: x, reason: collision with root package name */
    public int f6334x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f6335z;

    static {
        HashMap hashMap = new HashMap();
        f6320G = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC0312Nc(Context context, InterfaceC0308Md interfaceC0308Md, boolean z4, boolean z5, C0372Zc c0372Zc) {
        super(context);
        this.f6330t = 0;
        this.f6331u = 0;
        this.f6325E = false;
        this.f6326F = null;
        setSurfaceTextureListener(this);
        this.f6327q = interfaceC0308Md;
        this.f6328r = c0372Zc;
        this.f6322B = z4;
        this.f6329s = z5;
        C1323w6 c1323w6 = c0372Zc.f8004e;
        AbstractC1230u.l(c1323w6, c0372Zc.d, "vpc2");
        c0372Zc.f8008i = true;
        c1323w6.b("vpn", s());
        c0372Zc.f8013n = this;
    }

    public final void E() {
        SurfaceTexture surfaceTexture;
        Q1.I.w("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f6333w == null || surfaceTexture2 == null) {
            return;
        }
        F(false);
        try {
            C2033d c2033d = N1.n.f1204A.f1221s;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f6332v = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f6332v.setOnCompletionListener(this);
            this.f6332v.setOnErrorListener(this);
            this.f6332v.setOnInfoListener(this);
            this.f6332v.setOnPreparedListener(this);
            this.f6332v.setOnVideoSizeChangedListener(this);
            this.f6335z = 0;
            if (this.f6322B) {
                C0362Xc c0362Xc = new C0362Xc(getContext());
                this.f6321A = c0362Xc;
                int width = getWidth();
                int height = getHeight();
                c0362Xc.f7628A = width;
                c0362Xc.f7652z = height;
                c0362Xc.f7630C = surfaceTexture2;
                this.f6321A.start();
                C0362Xc c0362Xc2 = this.f6321A;
                if (c0362Xc2.f7630C == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c0362Xc2.f7635H.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c0362Xc2.f7629B;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f6321A.c();
                    this.f6321A = null;
                }
            }
            this.f6332v.setDataSource(getContext(), this.f6333w);
            this.f6332v.setSurface(new Surface(surfaceTexture2));
            this.f6332v.setAudioStreamType(3);
            this.f6332v.setScreenOnWhilePlaying(true);
            this.f6332v.prepareAsync();
            G(1);
        } catch (IOException e4) {
            e = e4;
            Y9.t("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f6333w)), e);
            onError(this.f6332v, 1, 0);
        } catch (IllegalArgumentException e5) {
            e = e5;
            Y9.t("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f6333w)), e);
            onError(this.f6332v, 1, 0);
        } catch (IllegalStateException e6) {
            e = e6;
            Y9.t("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f6333w)), e);
            onError(this.f6332v, 1, 0);
        }
    }

    public final void F(boolean z4) {
        Q1.I.w("AdMediaPlayerView release");
        C0362Xc c0362Xc = this.f6321A;
        if (c0362Xc != null) {
            c0362Xc.c();
            this.f6321A = null;
        }
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f6332v.release();
            this.f6332v = null;
            G(0);
            if (z4) {
                this.f6331u = 0;
            }
        }
    }

    public final void G(int i4) {
        C0480cd c0480cd = this.f6585p;
        C0372Zc c0372Zc = this.f6328r;
        if (i4 == 3) {
            c0372Zc.f8012m = true;
            if (c0372Zc.f8009j && !c0372Zc.f8010k) {
                AbstractC1230u.l(c0372Zc.f8004e, c0372Zc.d, "vfp2");
                c0372Zc.f8010k = true;
            }
            c0480cd.d = true;
            c0480cd.a();
        } else if (this.f6330t == 3) {
            c0372Zc.f8012m = false;
            c0480cd.d = false;
            c0480cd.a();
        }
        this.f6330t = i4;
    }

    public final boolean H() {
        int i4;
        return (this.f6332v == null || (i4 = this.f6330t) == -1 || i4 == 0 || i4 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int j() {
        if (H()) {
            return this.f6332v.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int k() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !H()) {
            return -1;
        }
        metrics = this.f6332v.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int l() {
        if (H()) {
            return this.f6332v.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0395ad
    public final void m() {
        C0480cd c0480cd = this.f6585p;
        float f4 = c0480cd.c ? c0480cd.f8369e ? 0.0f : c0480cd.f8370f : 0.0f;
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer == null) {
            Y9.s("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f4, f4);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int n() {
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int o() {
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        this.f6335z = i4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Q1.I.w("AdMediaPlayerView completion");
        G(5);
        this.f6331u = 5;
        Q1.N.f1668k.post(new RunnableC0302Lc(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i4);
        HashMap hashMap = f6320G;
        String str = (String) hashMap.get(valueOf);
        String str2 = (String) hashMap.get(Integer.valueOf(i5));
        Y9.s("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.f6331u = -1;
        Q1.N.f1668k.post(new RunnableC0801k(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i4);
        HashMap hashMap = f6320G;
        Q1.I.w("AdMediaPlayerView MediaPlayer info: " + ((String) hashMap.get(valueOf)) + ":" + ((String) hashMap.get(Integer.valueOf(i5))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f6334x
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.y
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f6334x
            if (r2 <= 0) goto L7a
            int r2 = r5.y
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.Xc r2 = r5.f6321A
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f6334x
            int r1 = r0 * r7
            int r2 = r5.y
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.y
            int r0 = r0 * r6
            int r2 = r5.f6334x
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f6334x
            int r1 = r1 * r7
            int r2 = r5.y
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f6334x
            int r4 = r5.y
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.Xc r6 = r5.f6321A
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0312Nc.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Q1.I.w("AdMediaPlayerView prepared");
        G(2);
        C0372Zc c0372Zc = this.f6328r;
        if (c0372Zc.f8008i && !c0372Zc.f8009j) {
            AbstractC1230u.l(c0372Zc.f8004e, c0372Zc.d, "vfr2");
            c0372Zc.f8009j = true;
        }
        Q1.N.f1668k.post(new RunnableC0203p(this, mediaPlayer, 13, false));
        this.f6334x = mediaPlayer.getVideoWidth();
        this.y = mediaPlayer.getVideoHeight();
        int i4 = this.f6323C;
        if (i4 != 0) {
            v(i4);
        }
        if (this.f6329s && H() && this.f6332v.getCurrentPosition() > 0 && this.f6331u != 3) {
            Q1.I.w("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f6332v;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                Y9.s("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f6332v.start();
            int currentPosition = this.f6332v.getCurrentPosition();
            N1.n.f1204A.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (H() && this.f6332v.getCurrentPosition() == currentPosition) {
                N1.n.f1204A.f1212j.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f6332v.pause();
            m();
        }
        Y9.r("AdMediaPlayerView stream dimensions: " + this.f6334x + " x " + this.y);
        if (this.f6331u == 3) {
            u();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        Q1.I.w("AdMediaPlayerView surface created");
        E();
        Q1.N.f1668k.post(new RunnableC0302Lc(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Q1.I.w("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer != null && this.f6323C == 0) {
            this.f6323C = mediaPlayer.getCurrentPosition();
        }
        C0362Xc c0362Xc = this.f6321A;
        if (c0362Xc != null) {
            c0362Xc.c();
        }
        Q1.N.f1668k.post(new RunnableC0302Lc(this, 2));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        Q1.I.w("AdMediaPlayerView surface changed");
        int i6 = this.f6331u;
        boolean z4 = false;
        if (this.f6334x == i4 && this.y == i5) {
            z4 = true;
        }
        if (this.f6332v != null && i6 == 3 && z4) {
            int i7 = this.f6323C;
            if (i7 != 0) {
                v(i7);
            }
            u();
        }
        C0362Xc c0362Xc = this.f6321A;
        if (c0362Xc != null) {
            c0362Xc.b(i4, i5);
        }
        Q1.N.f1668k.post(new RunnableC0307Mc(this, i4, i5, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f6328r.b(this);
        this.f6584o.a(surfaceTexture, this.f6324D);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
        Q1.I.w("AdMediaPlayerView size changed: " + i4 + " x " + i5);
        this.f6334x = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.y = videoHeight;
        if (this.f6334x == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        Q1.I.w("AdMediaPlayerView window visibility changed to " + i4);
        Q1.N.f1668k.post(new C0.C(i4, 8, this));
        super.onWindowVisibilityChanged(i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long p() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long q() {
        if (this.f6326F != null) {
            return (r() * this.f6335z) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long r() {
        if (this.f6326F != null) {
            return l() * this.f6326F.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final String s() {
        return "MediaPlayer".concat(true != this.f6322B ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void t() {
        Q1.I.w("AdMediaPlayerView pause");
        if (H() && this.f6332v.isPlaying()) {
            this.f6332v.pause();
            G(4);
            Q1.N.f1668k.post(new RunnableC0302Lc(this, 4));
        }
        this.f6331u = 4;
    }

    @Override // android.view.View
    public final String toString() {
        return n0.a.i(TextureViewSurfaceTextureListenerC0312Nc.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void u() {
        Q1.I.w("AdMediaPlayerView play");
        if (H()) {
            this.f6332v.start();
            G(3);
            this.f6584o.c = true;
            Q1.N.f1668k.post(new RunnableC0302Lc(this, 3));
        }
        this.f6331u = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void v(int i4) {
        Q1.I.w("AdMediaPlayerView seek " + i4);
        if (!H()) {
            this.f6323C = i4;
        } else {
            this.f6332v.seekTo(i4);
            this.f6323C = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void w(C0337Sc c0337Sc) {
        this.f6324D = c0337Sc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void x(String str) {
        Uri parse = Uri.parse(str);
        C0509d5 h4 = C0509d5.h(parse);
        if (h4 == null || h4.f8451o != null) {
            if (h4 != null) {
                parse = Uri.parse(h4.f8451o);
            }
            this.f6333w = parse;
            this.f6323C = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void y() {
        Q1.I.w("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f6332v;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f6332v.release();
            this.f6332v = null;
            G(0);
            this.f6331u = 0;
        }
        this.f6328r.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void z(float f4, float f5) {
        C0362Xc c0362Xc = this.f6321A;
        if (c0362Xc != null) {
            c0362Xc.d(f4, f5);
        }
    }
}
