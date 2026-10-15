package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C0831kn;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2058e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15182a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15184e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f15185f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f15186g;

    /* renamed from: h, reason: collision with root package name */
    public int f15187h;

    /* renamed from: j, reason: collision with root package name */
    public C0831kn f15189j;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f15191l;

    /* renamed from: m, reason: collision with root package name */
    public String f15192m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15193n;

    /* renamed from: o, reason: collision with root package name */
    public final Notification f15194o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f15195p;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15183b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15188i = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15190k = false;

    public C2058e(Context context, String str) {
        Notification notification = new Notification();
        this.f15194o = notification;
        this.f15182a = context;
        this.f15192m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f15187h = 0;
        this.f15195p = new ArrayList();
        this.f15193n = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0105. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02af  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, t3.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification a() {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2058e.a():android.app.Notification");
    }

    public final void c(C0831kn c0831kn) {
        if (this.f15189j != c0831kn) {
            this.f15189j = c0831kn;
            if (((C2058e) c0831kn.f9319p) != this) {
                c0831kn.f9319p = this;
                c(c0831kn);
            }
        }
    }
}
