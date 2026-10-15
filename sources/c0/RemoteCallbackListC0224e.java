package c0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0224e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3512a;

    public RemoteCallbackListC0224e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3512a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap hashMap = this.f3512a.f3115p;
        Integer num = (Integer) obj;
        num.intValue();
        hashMap.remove(num);
    }
}
