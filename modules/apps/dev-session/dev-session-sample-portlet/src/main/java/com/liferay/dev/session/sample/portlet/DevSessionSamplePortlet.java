package com.liferay.dev.session.sample.portlet;

import com.liferay.dev.session.sample.constants.DevSessionSamplePortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author GlassOfWhiskey
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Dev Session Sample Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DevSessionSamplePortletKeys.DEV_SESSION_SAMPLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DevSessionSamplePortlet extends MVCPortlet {
	
	private static final Log _log = LogFactoryUtil.
		getLog(DevSessionSamplePortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		super.render(renderRequest, renderResponse);
		
		_log.debug("I'm rendering " + DevSessionSamplePortletKeys.DEV_SESSION_SAMPLE);
	}
}