package r0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1966a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f14746b = n.h("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f14747a;

    public C1966a(Context context) {
        this.f14747a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
