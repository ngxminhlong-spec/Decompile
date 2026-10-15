package s3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import q3.f;
import q3.g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f14802a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f14802a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // q3.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f14802a.format((Date) obj));
    }
}
