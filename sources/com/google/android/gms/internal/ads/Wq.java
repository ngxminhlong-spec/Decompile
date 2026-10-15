package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import b1.C0215b;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wq extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7573a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f7574b;
    public float c;
    public final C0215b d;

    public Wq(Handler handler, Context context, C0215b c0215b) {
        super(handler);
        this.f7573a = context;
        this.f7574b = (AudioManager) context.getSystemService("audio");
        this.d = c0215b;
    }

    public final float a() {
        AudioManager audioManager = this.f7574b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f4 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f4 = streamVolume / streamMaxVolume;
            if (f4 > 1.0f) {
                return 1.0f;
            }
        }
        return f4;
    }

    public final void b() {
        float f4 = this.c;
        C0215b c0215b = this.d;
        c0215b.f3457o = f4;
        if (((Zq) c0215b.f3459q) == null) {
            c0215b.f3459q = Zq.c;
        }
        Iterator it = Collections.unmodifiableCollection(((Zq) c0215b.f3459q).f8056b).iterator();
        while (it.hasNext()) {
            Zf.B(((Rq) it.next()).d.a(), "setDeviceVolume", Float.valueOf(f4));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        super.onChange(z4);
        float a4 = a();
        if (a4 != this.c) {
            this.c = a4;
            b();
        }
    }
}
